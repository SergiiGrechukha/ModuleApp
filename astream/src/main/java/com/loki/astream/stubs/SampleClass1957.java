package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1957 {

    @Ignore    private SampleClass1958 sampleClass;

    public SampleClass1957(){
        sampleClass = new SampleClass1958();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}