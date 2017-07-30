package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass807 {

    @Ignore    private SampleClass808 sampleClass;

    public SampleClass807(){
        sampleClass = new SampleClass808();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}