import styled, { keyframes } from 'styled-components';
import { Link } from 'react-router-dom';

import SearchbarComponent from 'components/Searchbar/Searchbar';
import HighLightedText from 'components/@common/HighlightedText/HighlightedText';
import Avatar from 'components/@common/Avatar/Avatar';
import IconButtonComponent from 'components/@common/IconButton/IconButton';
import { PALETTE } from 'constants/palette';
import { FONT_SIZE, Z_INDEX } from 'constants/styles';
import { hoverUnderline } from 'commonStyles';
import ArrowIcon from 'assets/carouselArrow.svg';

const Root = styled.div`
  position: relative;
`;

const SearchContainer = styled.div`
  position: relative;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  z-index: ${Z_INDEX.HOME_SEARCHBAR};
  max-width: 736px;
  margin: 0 auto;
  padding: 0 1rem;

  & > .search-bar {
    z-index: ${Z_INDEX.HOME_SEARCHBAR};
  }
`;

const EllipseWrapper = styled.div`
  position: absolute;
  width: 100%;
  top: -1.5rem;
  left: 0;
`;

const bounce = keyframes`
  0%, 100% {
    transform: translateY(-10%);
  }

  50% {
    transform: translateY(10%);
  }
`;

const SearchTitle = styled.div`
  font-size: 1.5rem;
  color: ${({ theme }) => theme.highLightedText};
  font-weight: ${({ theme }) => theme.titleWeight};
  margin-bottom: 18px;
  animation: ${bounce} 1s linear infinite;
`;

export const Searchbar = styled(SearchbarComponent)`
  position: relative;
  width: 100%;
  height: 2.5rem;
  margin-bottom: 18px;
`;

const TrendContainer = styled.div`
  display: flex;
  gap: 0.75rem;
  align-items: center;

  & span {
    color: ${PALETTE.WHITE_400};
    line-height: 1rem;
  }

  & span.trends {
    font-weight: 700;
  }
`;

const TrendTag = styled.span`
  cursor: pointer;

  > .trends-text {
    ${hoverUnderline};
  }

  > .trends-bar {
    margin-right: 0.75rem;
  }
`;

const ContentArea = styled.div`
  position: relative;
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 2rem;
  margin-top: 8rem;
`;

const TitleWrapper = styled.div`
  display: flex;
  justify-content: space-between;
  align-items: center;
  width: 100%;
  padding: 0 1rem;
`;

const SectionTitle = styled(HighLightedText)`
  font-size: ${FONT_SIZE.LARGE};
`;

const HotToysContainer = styled.div`
  width: 100%;
  display: flex;
  align-items: center;
  justify-content: center;
`;

const VerticalAvatar = styled(Avatar)`
  margin-bottom: 12px;
`;

const ToysContainer = styled.div`
  display: flex;
  flex-direction: column;
  width: 100%;
  gap: 1rem;
`;

export const MoreButton = styled(Link)`
  display: inline;
  border: none;
  background: transparent;
  font-size: 1rem;

  & .visually-hidden {
    width: 1px;
    height: 1px;
    clip: rect(0 0 0 0);
    overflow: hidden;
    position: absolute;
  }
`;

const ArrowUp = styled(ArrowIcon)`
  transform: rotate(-90deg);
`;

export const ScrollUpButton = styled(IconButtonComponent)`
  width: 2.25rem;
  height: 2.25rem;
  padding: 0.55rem;
  position: fixed;
  right: 1rem;
  bottom: 1rem;
`;

export default {
  Root,
  SearchContainer,
  EllipseWrapper,
  SearchTitle,
  TrendContainer,
  TrendTag,
  ContentArea,
  TitleWrapper,
  SectionTitle,
  HotToysContainer,
  VerticalAvatar,
  ToysContainer,
  ArrowUp,
};
