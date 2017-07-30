package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1956 {

    @Ignore    private SampleClass1957 sampleClass;

    public SampleClass1956(){
        sampleClass = new SampleClass1957();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}