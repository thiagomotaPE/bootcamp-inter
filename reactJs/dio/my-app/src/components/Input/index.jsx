import React from "react";
import { IconContainer, InputContainer, InputText } from './styles';

const Input = (name, ...rest) => {
  return (
    <InputContainer>
        <InputText {...rest} />
    </InputContainer>
  )
}

export { Input };
