package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass302 {

    @Ignore    private SampleClass303 sampleClass;

    public SampleClass302(){
        sampleClass = new SampleClass303();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}