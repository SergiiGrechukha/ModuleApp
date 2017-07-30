package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1755 {

    @Ignore    private SampleClass1756 sampleClass;

    public SampleClass1755(){
        sampleClass = new SampleClass1756();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}