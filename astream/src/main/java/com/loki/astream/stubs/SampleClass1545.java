package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1545 {

    @Ignore    private SampleClass1546 sampleClass;

    public SampleClass1545(){
        sampleClass = new SampleClass1546();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}