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

class ThriftHiveMetastore_truncate_table_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'dbName',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'tableName',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'partNames',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRING,
            'elem' => array(
                'type' => TType::STRING,
                ),
        ),
    );

    /**
     * @var string
     */
    public $dbName = null;
    /**
     * @var string
     */
    public $tableName = null;
    /**
     * @var string[]
     */
    public $partNames = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['dbName'])) {
                $this->dbName = $vals['dbName'];
            }
            if (isset($vals['tableName'])) {
                $this->tableName = $vals['tableName'];
            }
            if (isset($vals['partNames'])) {
                $this->partNames = $vals['partNames'];
            }
        }
    }

    public function getName()
    {
        return 'ThriftHiveMetastore_truncate_table_args';
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
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->dbName);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->tableName);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::LST) {
                        $this->partNames = array();
                        $_size1377 = 0;
                        $_etype1380 = 0;
                        $xfer += $input->readListBegin($_etype1380, $_size1377);
                        for ($_i1381 = 0; $_i1381 < $_size1377; ++$_i1381) {
                            $elem1382 = null;
                            $xfer += $input->readString($elem1382);
                            $this->partNames []= $elem1382;
                        }
                        $xfer += $input->readListEnd();
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
        $xfer += $output->writeStructBegin('ThriftHiveMetastore_truncate_table_args');
        if ($this->dbName !== null) {
            $xfer += $output->writeFieldBegin('dbName', TType::STRING, 1);
            $xfer += $output->writeString($this->dbName);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->tableName !== null) {
            $xfer += $output->writeFieldBegin('tableName', TType::STRING, 2);
            $xfer += $output->writeString($this->tableName);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->partNames !== null) {
            if (!is_array($this->partNames)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('partNames', TType::LST, 3);
            $output->writeListBegin(TType::STRING, count($this->partNames));
            foreach ($this->partNames as $iter1383) {
                $xfer += $output->writeString($iter1383);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
