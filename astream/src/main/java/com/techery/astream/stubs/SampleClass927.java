package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass927 {

    @Ignore    private SampleClass928 sampleClass;

    public SampleClass927(){
        sampleClass = new SampleClass928();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}