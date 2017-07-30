package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass517 {

    @Ignore    private SampleClass518 sampleClass;

    public SampleClass517(){
        sampleClass = new SampleClass518();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}