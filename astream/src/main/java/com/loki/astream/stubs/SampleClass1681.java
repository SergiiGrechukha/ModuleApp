package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1681 {

    @Ignore    private SampleClass1682 sampleClass;

    public SampleClass1681(){
        sampleClass = new SampleClass1682();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}