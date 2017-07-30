package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1870 {

    @Ignore    private SampleClass1871 sampleClass;

    public SampleClass1870(){
        sampleClass = new SampleClass1871();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}