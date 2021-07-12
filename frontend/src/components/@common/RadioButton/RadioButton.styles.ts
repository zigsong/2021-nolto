import styled from 'styled-components';

import { PALETTE } from 'constants/palette';

const Label = styled.label`
  display: flex;
  position: relative;
  cursor: pointer;
  font-size: 16px;
  user-select: none;
  align-items: center;
`;

const Text = styled.span`
  padding-left: 7px;
  margin-right: 10px;
  font-size: 24px;
  line-height: 24px;
`;

const RadioInput = styled.input`
  opacity: 0;
  width: 0;
  height: 0;
`;

const RadioMark = styled.span<{ checked: boolean }>`
  width: 32px;
  height: 32px;
  border: ${({ checked }) => (checked ? '8px' : '2px')} solid ${PALETTE.PRIMARY_400};
  border-radius: 25px;
  background-color: ${PALETTE.WHITE_400};
`;

export default {
  Label,
  Text,
  RadioInput,
  RadioMark,
};
