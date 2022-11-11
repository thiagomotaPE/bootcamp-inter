import React from "react";
import {InputContainer, InputText } from './styles';

const Input = (name, ...rest) => {
  return (
    <InputContainer>
        <InputText {...rest} />
    </InputContainer>
  )
}

export { Input };
