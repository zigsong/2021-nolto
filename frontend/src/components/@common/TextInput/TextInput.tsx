import React, { InputHTMLAttributes } from 'react';

import Styled from './TextInput.styles';

type Props = InputHTMLAttributes<HTMLInputElement>;

const TextInput = ({ ...options }: Props) => {
  return <Styled.Root {...options} />;
};

export default TextInput;