package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass944 {

    @Ignore    private SampleClass945 sampleClass;

    public SampleClass944(){
        sampleClass = new SampleClass945();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}