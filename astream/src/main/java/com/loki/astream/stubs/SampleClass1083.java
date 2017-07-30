package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1083 {

    @Ignore    private SampleClass1084 sampleClass;

    public SampleClass1083(){
        sampleClass = new SampleClass1084();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}