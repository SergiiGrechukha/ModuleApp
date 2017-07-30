package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass621 {

    @Ignore    private SampleClass622 sampleClass;

    public SampleClass621(){
        sampleClass = new SampleClass622();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}