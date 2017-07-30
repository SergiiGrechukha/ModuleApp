package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass340 {

    @Ignore    private SampleClass341 sampleClass;

    public SampleClass340(){
        sampleClass = new SampleClass341();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}