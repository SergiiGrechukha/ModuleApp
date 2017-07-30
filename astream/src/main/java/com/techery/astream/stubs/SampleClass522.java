package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass522 {

    @Ignore    private SampleClass523 sampleClass;

    public SampleClass522(){
        sampleClass = new SampleClass523();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}