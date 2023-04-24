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

class ThriftHiveMetastore_exchange_partition_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'partitionSpecs',
            'isRequired' => false,
            'type' => TType::MAP,
            'ktype' => TType::STRING,
            'vtype' => TType::STRING,
            'key' => array(
                'type' => TType::STRING,
            ),
            'val' => array(
                'type' => TType::STRING,
                ),
        ),
        2 => array(
            'var' => 'source_db',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'source_table_name',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        4 => array(
            'var' => 'dest_db',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        5 => array(
            'var' => 'dest_table_name',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var array
     */
    public $partitionSpecs = null;
    /**
     * @var string
     */
    public $source_db = null;
    /**
     * @var string
     */
    public $source_table_name = null;
    /**
     * @var string
     */
    public $dest_db = null;
    /**
     * @var string
     */
    public $dest_table_name = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['partitionSpecs'])) {
                $this->partitionSpecs = $vals['partitionSpecs'];
            }
            if (isset($vals['source_db'])) {
                $this->source_db = $vals['source_db'];
            }
            if (isset($vals['source_table_name'])) {
                $this->source_table_name = $vals['source_table_name'];
            }
            if (isset($vals['dest_db'])) {
                $this->dest_db = $vals['dest_db'];
            }
            if (isset($vals['dest_table_name'])) {
                $this->dest_table_name = $vals['dest_table_name'];
            }
        }
    }

    public function getName()
    {
        return 'ThriftHiveMetastore_exchange_partition_args';
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
                    if ($ftype == TType::MAP) {
                        $this->partitionSpecs = array();
                        $_size1510 = 0;
                        $_ktype1511 = 0;
                        $_vtype1512 = 0;
                        $xfer += $input->readMapBegin($_ktype1511, $_vtype1512, $_size1510);
                        for ($_i1514 = 0; $_i1514 < $_size1510; ++$_i1514) {
                            $key1515 = '';
                            $val1516 = '';
                            $xfer += $input->readString($key1515);
                            $xfer += $input->readString($val1516);
                            $this->partitionSpecs[$key1515] = $val1516;
                        }
                        $xfer += $input->readMapEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->source_db);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->source_table_name);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->dest_db);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->dest_table_name);
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
        $xfer += $output->writeStructBegin('ThriftHiveMetastore_exchange_partition_args');
        if ($this->partitionSpecs !== null) {
            if (!is_array($this->partitionSpecs)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('partitionSpecs', TType::MAP, 1);
            $output->writeMapBegin(TType::STRING, TType::STRING, count($this->partitionSpecs));
            foreach ($this->partitionSpecs as $kiter1517 => $viter1518) {
                $xfer += $output->writeString($kiter1517);
                $xfer += $output->writeString($viter1518);
            }
            $output->writeMapEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->source_db !== null) {
            $xfer += $output->writeFieldBegin('source_db', TType::STRING, 2);
            $xfer += $output->writeString($this->source_db);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->source_table_name !== null) {
            $xfer += $output->writeFieldBegin('source_table_name', TType::STRING, 3);
            $xfer += $output->writeString($this->source_table_name);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->dest_db !== null) {
            $xfer += $output->writeFieldBegin('dest_db', TType::STRING, 4);
            $xfer += $output->writeString($this->dest_db);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->dest_table_name !== null) {
            $xfer += $output->writeFieldBegin('dest_table_name', TType::STRING, 5);
            $xfer += $output->writeString($this->dest_table_name);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
