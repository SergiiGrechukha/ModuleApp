package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1541 {

    @Ignore    private SampleClass1542 sampleClass;

    public SampleClass1541(){
        sampleClass = new SampleClass1542();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}