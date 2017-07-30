package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass220 {

    @Ignore    private SampleClass221 sampleClass;

    public SampleClass220(){
        sampleClass = new SampleClass221();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}