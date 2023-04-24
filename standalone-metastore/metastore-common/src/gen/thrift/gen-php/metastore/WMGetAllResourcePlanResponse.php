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

class WMGetAllResourcePlanResponse
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'resourcePlans',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\WMResourcePlan',
                ),
        ),
    );

    /**
     * @var \metastore\WMResourcePlan[]
     */
    public $resourcePlans = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['resourcePlans'])) {
                $this->resourcePlans = $vals['resourcePlans'];
            }
        }
    }

    public function getName()
    {
        return 'WMGetAllResourcePlanResponse';
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
                    if ($ftype == TType::LST) {
                        $this->resourcePlans = array();
                        $_size1051 = 0;
                        $_etype1054 = 0;
                        $xfer += $input->readListBegin($_etype1054, $_size1051);
                        for ($_i1055 = 0; $_i1055 < $_size1051; ++$_i1055) {
                            $elem1056 = null;
                            $elem1056 = new \metastore\WMResourcePlan();
                            $xfer += $elem1056->read($input);
                            $this->resourcePlans []= $elem1056;
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
        $xfer += $output->writeStructBegin('WMGetAllResourcePlanResponse');
        if ($this->resourcePlans !== null) {
            if (!is_array($this->resourcePlans)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('resourcePlans', TType::LST, 1);
            $output->writeListBegin(TType::STRUCT, count($this->resourcePlans));
            foreach ($this->resourcePlans as $iter1057) {
                $xfer += $iter1057->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
