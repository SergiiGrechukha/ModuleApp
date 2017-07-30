package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass301 {

    @Ignore    private SampleClass302 sampleClass;

    public SampleClass301(){
        sampleClass = new SampleClass302();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}