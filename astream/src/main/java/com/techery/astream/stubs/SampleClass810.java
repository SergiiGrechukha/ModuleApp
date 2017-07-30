package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass810 {

    @Ignore    private SampleClass811 sampleClass;

    public SampleClass810(){
        sampleClass = new SampleClass811();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}