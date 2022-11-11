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
    UserPicture,
} from './styles';

const Header = ({autenticado}) =>  {
  return (
   <Wrapper>
        <Container>
            <Row>
                <img src={logo} alt="Logo-Dio" />
                {autenticado ? (
                    <>
                    <BuscarInputContainer>
                    <Input placeholder='Faça sua busca'/>
                    </BuscarInputContainer>
                    <Menu>Live code</Menu>
                    <Menu>Global</Menu>
                    </>
                ) : null}
                
            </Row>

            <Row>
                {autenticado ? (
                    <>
                    <UserPicture src='https://avatars.githubusercontent.com/u/87782152?v=4'/>
                    </>
                ) : (
                    <>
                    <MenuRight href='#'>Home</MenuRight>
                    <Button title="Entrar" />
                    <Button title="Cadastrar" />
                    </>
                )}
                
            </Row>
        </Container>
   </Wrapper>
  )
}

export {Header}
