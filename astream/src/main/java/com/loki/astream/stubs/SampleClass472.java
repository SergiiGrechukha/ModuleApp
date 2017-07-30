package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass472 {

    @Ignore    private SampleClass473 sampleClass;

    public SampleClass472(){
        sampleClass = new SampleClass473();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}