package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1234 {

    @Ignore    private SampleClass1235 sampleClass;

    public SampleClass1234(){
        sampleClass = new SampleClass1235();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}