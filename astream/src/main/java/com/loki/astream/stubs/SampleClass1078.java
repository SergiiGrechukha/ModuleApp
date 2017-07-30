package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1078 {

    @Ignore    private SampleClass1079 sampleClass;

    public SampleClass1078(){
        sampleClass = new SampleClass1079();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}