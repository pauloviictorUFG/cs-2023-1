# Expressões Regulares

## Data
- Formato: dd/mm/aa
- Expressão Regular: `^\d{2}/\d{2}/\d{2}$`

## Data
- Formato: dd/mm/aaa
- Expressão Regular: `^\d{2}/\d{2}/\d{4}$`

## Data
- Formato: dd/mm/aaa hh:mm:ss
- Expressão Regular: `^\d{2}/\d{2}/\d{4} \d{2}:\d{2}:\d{2}$`

## Data
- Formato: yy/mm/dd
- Expressão Regular: `^\d{2}/\d{2}/\d{2}$`

## Data
- Formato: yyyy/mm/dd
- Expressão Regular: `^\d{4}/\d{2}/\d{2}$`

## Número decimal
- Formato: dd.ddd.ddd
- Expressão Regular: `^\d{1,5}\.\d{1,5}\.\d{1,5}$`

## Nomes de Arquivos / documentos
- Formato: nome.(doc,docx,xls,xlsx,pdf,csv,txt)
- Expressão Regular: `^nome\.(doc|docx|xls|xlsx|pdf|csv|txt)$`

## E-mail
- Formato: nome@dominio
- Expressão Regular: `^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.(com|com\.br|goias\.gov\.br|(\.mil|\.gov|\.esp|\.edu)\.(br|ar|uk|fr|ru|es|it))$`

## Codigo Cor HTML
- Formato: #00ccff
- Expressão Regular: `^#[0-9a-fA-F]{6}$`

## Arquivo de Imagem
- Formato: *.(jpg,gif,png), etc.
- Expressão Regular: `^.*\.(jpg|gif|png)$`

## Endereco IP
- Formato: 192.168.1.1
- Expressão Regular: `^\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}$`

## Arquivos Multimedia
- Formato: *.(swf,mov,wma,mpg,mp3,wav)
- Expressão Regular: `^.*\.(swf|mov|wma|mpg|mp3|wav)$`

## Telefone (BR)
- Formato: (11) 5555-1977
- Expressão Regular: `^\(\d{2}\) \d{4}-\d{4}$`

## Celular (BR)
- Formato: (55) (62) 9834.1243
- Expressão Regular: `^\(\d{2}\) \(\d{2}\) \d{4}\.\d{4}$`

## Hora
- Formato: (HH:MM)
- Expressão Regular: `^\d{2}:\d{2}$`

## Hora
- Formato: (HH:MM:SS)
- Expressão Regular: `^\d{2}:\d{2}:\d{2}$`

## URL
- Formato: http://www.google.com, https://www.google.com.br
- Expressão Regular:
