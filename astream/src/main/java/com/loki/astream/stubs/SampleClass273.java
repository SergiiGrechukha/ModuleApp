package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass273 {

    @Ignore    private SampleClass274 sampleClass;

    public SampleClass273(){
        sampleClass = new SampleClass274();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}