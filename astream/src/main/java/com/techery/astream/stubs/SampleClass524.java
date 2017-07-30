package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass524 {

    @Ignore    private SampleClass525 sampleClass;

    public SampleClass524(){
        sampleClass = new SampleClass525();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}