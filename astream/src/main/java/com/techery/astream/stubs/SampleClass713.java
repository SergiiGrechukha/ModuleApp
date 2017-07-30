package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass713 {

    @Ignore    private SampleClass714 sampleClass;

    public SampleClass713(){
        sampleClass = new SampleClass714();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}