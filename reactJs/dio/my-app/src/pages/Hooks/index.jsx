import React from 'react'
import { useState, useEffect, useMemo, useCallback } from 'react';

const Teste = () => {


    //useState + useCallback
    const [name, setName] = useState('mota');
    const [age, setAge] = useState(21);

    const handleChangeName = useCallback(() => {
        setName(prev => prev === 'mota' ? 'thiago' : 'mota')
    }, []);


    const handleChangeAge = useCallback(() => {
        const newage = 10 * age
        console.log('idade atual', age, newage);
        setAge(prev => prev === 21 ? 22 : 21)
    }, [age]);


    
    //useEffect
    // const changUser = () => {
    //     handleChangeName();
    // }
    // useEffect(() => {
    //     changUser();
    // }, [])



    //useMemo
    const calculo = useMemo(() => { 
        console.log('calculou', age)
        return 10 * 2
    }, []);



  return (
    <div>
        <p>idade: {age}</p>
        <p>nome: {name}</p>
        <button onClick={handleChangeAge}>alterar idade</button> <br />
        <button onClick={handleChangeName}>alterar nome</button>
    </div>
  )
}

export { Teste }