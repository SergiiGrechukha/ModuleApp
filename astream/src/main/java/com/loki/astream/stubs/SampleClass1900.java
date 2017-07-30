package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1900 {

    @Ignore    private SampleClass1901 sampleClass;

    public SampleClass1900(){
        sampleClass = new SampleClass1901();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}