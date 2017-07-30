package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass7 {

    @Ignore    private SampleClass8 sampleClass;

    public SampleClass7(){
        sampleClass = new SampleClass8();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}