package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass287 {

    @Ignore    private SampleClass288 sampleClass;

    public SampleClass287(){
        sampleClass = new SampleClass288();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}