const estilo = {color: 'red'};
const estilo2 = {color: 'black'};

const Sobre = () => {
    return (
        <article>
            <h2 style={estilo}>React:</h2>
            <p style={estilo2}>O React é uma biblioteca JavaScript de código aberto com foco em criar interfaces de usuário em páginas web.</p>
        </article>
    );
};

export default Sobre;