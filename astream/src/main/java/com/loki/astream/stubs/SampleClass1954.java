package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1954 {

    @Ignore    private SampleClass1955 sampleClass;

    public SampleClass1954(){
        sampleClass = new SampleClass1955();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}