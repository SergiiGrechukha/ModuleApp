package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1488 {

    @Ignore    private SampleClass1489 sampleClass;

    public SampleClass1488(){
        sampleClass = new SampleClass1489();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}