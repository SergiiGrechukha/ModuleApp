package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass525 {

    @Ignore    private SampleClass526 sampleClass;

    public SampleClass525(){
        sampleClass = new SampleClass526();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}