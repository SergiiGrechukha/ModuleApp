package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1355 {

    @Ignore    private SampleClass1356 sampleClass;

    public SampleClass1355(){
        sampleClass = new SampleClass1356();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}