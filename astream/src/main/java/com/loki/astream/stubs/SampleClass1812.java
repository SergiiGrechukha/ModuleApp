package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1812 {

    @Ignore    private SampleClass1813 sampleClass;

    public SampleClass1812(){
        sampleClass = new SampleClass1813();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}