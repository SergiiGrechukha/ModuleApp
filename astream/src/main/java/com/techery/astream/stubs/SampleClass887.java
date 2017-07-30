package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass887 {

    @Ignore    private SampleClass888 sampleClass;

    public SampleClass887(){
        sampleClass = new SampleClass888();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}