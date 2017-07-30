package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1502 {

    @Ignore    private SampleClass1503 sampleClass;

    public SampleClass1502(){
        sampleClass = new SampleClass1503();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}