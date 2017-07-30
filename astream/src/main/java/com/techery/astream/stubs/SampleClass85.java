package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass85 {

    @Ignore    private SampleClass86 sampleClass;

    public SampleClass85(){
        sampleClass = new SampleClass86();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}