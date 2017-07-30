package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1650 {

    @Ignore    private SampleClass1651 sampleClass;

    public SampleClass1650(){
        sampleClass = new SampleClass1651();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}