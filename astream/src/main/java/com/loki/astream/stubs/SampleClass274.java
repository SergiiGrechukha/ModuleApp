package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass274 {

    @Ignore    private SampleClass275 sampleClass;

    public SampleClass274(){
        sampleClass = new SampleClass275();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}