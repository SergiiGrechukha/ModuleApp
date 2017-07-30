package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1172 {

    @Ignore    private SampleClass1173 sampleClass;

    public SampleClass1172(){
        sampleClass = new SampleClass1173();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}