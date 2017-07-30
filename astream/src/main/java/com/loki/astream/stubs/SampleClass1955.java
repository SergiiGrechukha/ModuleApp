package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1955 {

    @Ignore    private SampleClass1956 sampleClass;

    public SampleClass1955(){
        sampleClass = new SampleClass1956();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}