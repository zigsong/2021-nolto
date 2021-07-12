import React, { InputHTMLAttributes } from 'react';

import Styled from './RadioButton.styles';

export interface Props extends InputHTMLAttributes<HTMLInputElement> {
  labelText?: string;
  name: string;
  value: string;
  checked?: boolean;
  onChange: (event: React.ChangeEvent<HTMLInputElement>) => void;
}

const RadioButton = ({ labelText = '', name, value, checked = false, onChange }: Props) => {
  return (
    <Styled.Label>
      <Styled.Text>{labelText}</Styled.Text>
      <Styled.RadioInput
        type="radio"
        name={name}
        value={value}
        checked={checked}
        onChange={onChange}
      />
      <Styled.RadioMark checked={checked}></Styled.RadioMark>
    </Styled.Label>
  );
};

export default RadioButton;
