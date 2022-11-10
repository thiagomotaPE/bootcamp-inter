import React from 'react'
import { Button } from '../Button';
import logo from '../../assets/logo-dio.png';

import {
    Container,
    BuscarInputContainer,
    Input,
    Menu,
    MenuRight,
    Wrapper,
    Row,
} from './styles';

const Header = () =>  {
  return (
   <Wrapper>
        <Container>
            <Row>
                <img src={logo} alt="Logo-Dio" />
                <BuscarInputContainer>
                    <Input placeholder='Faça sua busca'/>
                </BuscarInputContainer>
                <Menu>Live code</Menu>
                <Menu>Global</Menu>
            </Row>

            <Row>
                <MenuRight href='#'>Home</MenuRight>
                <Button title="Entrar" />
                <Button title="Cadastrar" />
            </Row>
        </Container>
   </Wrapper>
  )
}

export {Header}
