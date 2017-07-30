package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass186 {

    @Ignore    private SampleClass187 sampleClass;

    public SampleClass186(){
        sampleClass = new SampleClass187();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}