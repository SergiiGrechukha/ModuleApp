package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1735 {

    @Ignore    private SampleClass1736 sampleClass;

    public SampleClass1735(){
        sampleClass = new SampleClass1736();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}