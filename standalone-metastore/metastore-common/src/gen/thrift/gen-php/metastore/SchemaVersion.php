<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class SchemaVersion
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'schema',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\metastore\ISchemaName',
        ),
        2 => array(
            'var' => 'version',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        3 => array(
            'var' => 'createdAt',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        4 => array(
            'var' => 'cols',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\FieldSchema',
                ),
        ),
        5 => array(
            'var' => 'state',
            'isRequired' => false,
            'type' => TType::I32,
            'class' => '\metastore\SchemaVersionState',
        ),
        6 => array(
            'var' => 'description',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        7 => array(
            'var' => 'schemaText',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        8 => array(
            'var' => 'fingerprint',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        9 => array(
            'var' => 'name',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        10 => array(
            'var' => 'serDe',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\metastore\SerDeInfo',
        ),
    );

    /**
     * @var \metastore\ISchemaName
     */
    public $schema = null;
    /**
     * @var int
     */
    public $version = null;
    /**
     * @var int
     */
    public $createdAt = null;
    /**
     * @var \metastore\FieldSchema[]
     */
    public $cols = null;
    /**
     * @var int
     */
    public $state = null;
    /**
     * @var string
     */
    public $description = null;
    /**
     * @var string
     */
    public $schemaText = null;
    /**
     * @var string
     */
    public $fingerprint = null;
    /**
     * @var string
     */
    public $name = null;
    /**
     * @var \metastore\SerDeInfo
     */
    public $serDe = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['schema'])) {
                $this->schema = $vals['schema'];
            }
            if (isset($vals['version'])) {
                $this->version = $vals['version'];
            }
            if (isset($vals['createdAt'])) {
                $this->createdAt = $vals['createdAt'];
            }
            if (isset($vals['cols'])) {
                $this->cols = $vals['cols'];
            }
            if (isset($vals['state'])) {
                $this->state = $vals['state'];
            }
            if (isset($vals['description'])) {
                $this->description = $vals['description'];
            }
            if (isset($vals['schemaText'])) {
                $this->schemaText = $vals['schemaText'];
            }
            if (isset($vals['fingerprint'])) {
                $this->fingerprint = $vals['fingerprint'];
            }
            if (isset($vals['name'])) {
                $this->name = $vals['name'];
            }
            if (isset($vals['serDe'])) {
                $this->serDe = $vals['serDe'];
            }
        }
    }

    public function getName()
    {
        return 'SchemaVersion';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::STRUCT) {
                        $this->schema = new \metastore\ISchemaName();
                        $xfer += $this->schema->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->version);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->createdAt);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::LST) {
                        $this->cols = array();
                        $_size1079 = 0;
                        $_etype1082 = 0;
                        $xfer += $input->readListBegin($_etype1082, $_size1079);
                        for ($_i1083 = 0; $_i1083 < $_size1079; ++$_i1083) {
                            $elem1084 = null;
                            $elem1084 = new \metastore\FieldSchema();
                            $xfer += $elem1084->read($input);
                            $this->cols []= $elem1084;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->state);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 6:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->description);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 7:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->schemaText);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 8:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->fingerprint);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 9:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->name);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 10:
                    if ($ftype == TType::STRUCT) {
                        $this->serDe = new \metastore\SerDeInfo();
                        $xfer += $this->serDe->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('SchemaVersion');
        if ($this->schema !== null) {
            if (!is_object($this->schema)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('schema', TType::STRUCT, 1);
            $xfer += $this->schema->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->version !== null) {
            $xfer += $output->writeFieldBegin('version', TType::I32, 2);
            $xfer += $output->writeI32($this->version);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->createdAt !== null) {
            $xfer += $output->writeFieldBegin('createdAt', TType::I64, 3);
            $xfer += $output->writeI64($this->createdAt);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->cols !== null) {
            if (!is_array($this->cols)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('cols', TType::LST, 4);
            $output->writeListBegin(TType::STRUCT, count($this->cols));
            foreach ($this->cols as $iter1085) {
                $xfer += $iter1085->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->state !== null) {
            $xfer += $output->writeFieldBegin('state', TType::I32, 5);
            $xfer += $output->writeI32($this->state);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->description !== null) {
            $xfer += $output->writeFieldBegin('description', TType::STRING, 6);
            $xfer += $output->writeString($this->description);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->schemaText !== null) {
            $xfer += $output->writeFieldBegin('schemaText', TType::STRING, 7);
            $xfer += $output->writeString($this->schemaText);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->fingerprint !== null) {
            $xfer += $output->writeFieldBegin('fingerprint', TType::STRING, 8);
            $xfer += $output->writeString($this->fingerprint);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->name !== null) {
            $xfer += $output->writeFieldBegin('name', TType::STRING, 9);
            $xfer += $output->writeString($this->name);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->serDe !== null) {
            if (!is_object($this->serDe)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('serDe', TType::STRUCT, 10);
            $xfer += $this->serDe->write($output);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
